package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void testGrade_topA() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(1.0f), Grade.A);
    }

    @Test
    public void testGrade_bottomA() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(8f/9f+0.1f), Grade.A);
    }

    @Test
    public void testGrade_topB() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(8f/9f), Grade.B);
    }

    @Test
    public void testGrade_bottomB() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(13f/18f+0.1f), Grade.B);
    }

    @Test
    public void testGrade_topC() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(13f/18f), Grade.C);
    }

    @Test
    public void testGrade_bottomC() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(8f/15f+0.1f), Grade.C);
    }

    @Test
    public void testGrade_topD() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(8f/15f), Grade.D);
    }

    @Test
    public void testGrade_bottomD() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(1f/3f + 0.1f), Grade.D);
    }

    @Test
    public void testGrade_topF() {
        Converter converter = new Converter();
        Assertions.assertEquals(converter.toGrade(1f/3f), Grade.F);
    }
}
