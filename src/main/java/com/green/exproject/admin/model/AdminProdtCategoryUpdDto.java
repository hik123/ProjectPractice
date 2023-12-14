package com.green.exproject.admin.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "(관리자)상품 카테고리 변경 DTO")
public class AdminProdtCategoryUpdDto {
    private int productPk;
    private int categoryPk;
}