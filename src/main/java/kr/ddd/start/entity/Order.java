package kr.ddd.start.entity;

import kr.ddd.start.domain.type.OrderState;

import static kr.ddd.start.domain.type.OrderState.*;

/**
 * DDD 핵심
 * : Order와 관련된 핵심 로직은 Order 혹은 OrderState에 구현되어야 한다.
 */
public class Order {
    private OrderState state;
    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        if (!state.isShippingChangeable()) {
            throw new IllegalStateException("can't change shipping in " + state);
        }
        this.shippingInfo = newShippingInfo;
    }

    private boolean isShippingChangeable() {
        return state == PAYMENT_WAITING ||
                state == PREPARING;
    }

    public void changeShipped() {
        this.state = SHIPPED;
    }

    public void cancel() {
        if (!isShippingChangeable()) {
            throw new IllegalStateException("already shipped");
        }
    }
    public boolean completePayment() {
        return state != PREPARING;
    }
}

