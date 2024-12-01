package pe.edu.tecsup.tienda.webs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.tienda.dtos.ProductTO;
import pe.edu.tecsup.tienda.dtos.UserTO;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class ProductController {

    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("manager")
    public String manager() {
        return "manager";
    }

    @GetMapping("products")
    public String getProducts(Model model) {
        log.info("Call getProducts()");

        String message = "List of available products:";

        model.addAttribute("message", message);

        List<ProductTO> products = new ArrayList<>();
        products.add(new ProductTO("IPhone", 2000.0));
        products.add(new ProductTO("Galaxy", 2500.0));
        products.add(new ProductTO("Huawei", 1600.0));
        products.add(new ProductTO("Xiaomi", 1200.1));

        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("users")
    public String getUsers(Model model) {
        log.info("Call getUsers()");

        List<UserTO> users = new ArrayList<>();
        users.add(new UserTO(1L, "Carlos", "Perez", 20));
        users.add(new UserTO(2L, "Pedro", "Flores", 22));
        users.add(new UserTO(3L, "Rosa", "Ramirez", 24));
        users.add(new UserTO(4L, "Carla", "Guzman", 26));

        model.addAttribute("users", users);
        return "users";
    }
}
