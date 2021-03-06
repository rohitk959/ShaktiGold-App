package com.rohitrk.shaktigold.model;

import lombok.Data;

import java.util.List;

@Data
public class CategoryModel {
	private String categoryName;
	private String description;
	private boolean recordActive;
	private String sessionId;
	private String email;
	private String imgUrl;
	private List<SubCategoryModel> subcategory;
}
