package me.dio.sacola.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
