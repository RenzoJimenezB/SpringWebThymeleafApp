package pe.edu.tecsup.tienda.dtos;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryTO {
    private Long id;
    private String name;
    private Integer order;

    @ToString.Exclude
    private List<ProductTO> products = new ArrayList<>();
}
