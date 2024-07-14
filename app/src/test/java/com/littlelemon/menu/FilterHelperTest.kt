package com.littlelemon.menu

import junit.framework.TestCase.assertEquals
import org.junit.Test

class FilterHelperTest {

    private val filterHelper = FilterHelper()

    private val sampleProductsList = mutableListOf(
        ProductItem("Black tea", 3.00, "Drinks", R.drawable.black_tea),
        ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
        ProductItem("Bouillabaisse", 20.00, "Food", R.drawable.bouillabaisse)
    )

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val result = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)
        assertEquals(1, result.size) // Expecting only one item in the filtered list
        assertEquals("Croissant", result[0].title) // Expecting the filtered item to be "Croissant"
        assertEquals(7.00, result[0].price, 0.01) // Asserting price (with delta for floating-point comparison)
        assertEquals("Dessert", result[0].category) // Asserting category
        assertEquals(R.drawable.croissant, result[0].image) // Asserting image resource ID
    }
}