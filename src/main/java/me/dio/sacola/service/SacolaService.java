package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import org.springframework.stereotype.Service;

public interface SacolaService {
    Sacola verSacola(Long id);
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola fecharSacola(Long id, int formaPagamento);
}
