package alex.klimchuk.recipe.converters;

import alex.klimchuk.recipe.domain.Category;
import alex.klimchuk.recipe.dto.CategoryDto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Copyright Alex Klimchuk (c) 2022.
 */
public class CategoryDtoToCategoryTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "description";
    CategoryDtoToCategory converter;

    @Before
    public void setUp() throws Exception {
        converter = new CategoryDtoToCategory();
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new CategoryDto()));
    }

    @Test
    public void convert() throws Exception {
        CategoryDto categoryDtoMock = CategoryDto.builder()
                .id(ID_VALUE)
                .description(DESCRIPTION)
                .build();

        Category category = converter.convert(categoryDtoMock);

        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }

}
