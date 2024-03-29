package com.example.bookshop.dto.cart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AddToCartRequestDto {
    @NotNull(message = "Book id cannot be null")
    @Positive(message = "Book id must be greater than 0")
    private Long bookId;
    @Positive(message = "Quantity must be greater than 0")
    private Integer quantity;
}
