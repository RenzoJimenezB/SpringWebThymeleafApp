package pe.edu.tecsup.tienda.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductTO {
    private Long id;

    private CategoryTO category;

    @NonNull
    private String name;

    private String description;

    @NonNull
    private Double price;
    
    private Integer stock;
    private String image_name;
    private String image_type;
    private Long image_size;
    private Integer state;

    @Override
    public String toString() {
        return "ProductTO{" +
                "id=" + id +
                ", category name=" + category.getName() +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", image_name='" + image_name + '\'' +
                ", image_type='" + image_type + '\'' +
                ", image_size=" + image_size +
                ", state=" + state +
                '}';
    }
}
