package grupo3mtech.ao.pagamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @GetMapping("/info")
    public String getInfo() {
        return "Informações do Microsserviço Pagamento";
    }
}
