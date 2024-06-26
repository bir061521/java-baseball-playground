package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String str = "1,2";
        String[] split = str.split(",");
        assertThat(Arrays.toString(split)).isEqualTo("[1, 2]");

        String str2 = "1";
        String[] split2 = str2.split(",");
        assertThat(Arrays.toString(split2)).isEqualTo("[1]");

    }

    @Test
    void subString(){
        String str = "(1,2)";
        String subStr = str.substring(1,str.length()-1);

        assertThat(subStr).isEqualTo("1,2");

    }
    @DisplayName("특정 위치의 문자 가져오기")
    @Test
    void getIndex(){

        String str = "abc";
        int invalidIndex = 9;

       assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
           throw new IndexOutOfBoundsException(str.charAt(invalidIndex));
       }).withMessageContaining("String index out of range: " + invalidIndex);

    }



}
