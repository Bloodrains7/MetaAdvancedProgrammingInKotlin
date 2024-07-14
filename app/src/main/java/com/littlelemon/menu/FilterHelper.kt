package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { p -> p.category == "Dessert" }
            FilterType.Drinks -> productsList.filter { p -> p.category == "Drinks" }
            FilterType.Food -> productsList.filter { p -> p.category == "Food" }
        }
    }

}