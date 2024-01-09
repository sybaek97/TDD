import com.tdd.TestLotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;



class tddTest {

    List<Integer> lottoNumbers = TestLotto.generate();
    @Test
    public void testLottoSize() {
        assertEquals(6, lottoNumbers.size());
    }

    @Test
    public void testLottoNum() {
        for (int checkNum : lottoNumbers) {
            assertTrue(checkNum >= 1 && checkNum <= 45);
        }
    }

    @Test
    public void testLottoContains() {
        assertEquals(6, lottoNumbers.stream().distinct().count());
    }

}
