package cn.edu.nju.software.storymapping.map.controller.mockdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ItemDto {
    Long id;
    String title;
    Long order;

    public ItemDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}