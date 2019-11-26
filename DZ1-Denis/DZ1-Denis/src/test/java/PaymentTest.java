import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    @org.junit.jupiter.api.Test
    void calculate() {
        int volume = 19;
        Payment payment = new Payment();
        int result = payment.paymentDistance(volume);
        assertEquals(3, result);
    }

}