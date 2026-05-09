package ecommerce.payment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public Payment makePayment(@RequestBody Payment payment) {

        payment.setStatus("PAID");

        return paymentService.save(payment);
    }

    @GetMapping
    public List<Payment> getAll() {
        return paymentService.getAll();
    }
}