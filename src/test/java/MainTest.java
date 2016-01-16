import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value=org.junit.runners.Suite.class)
@Suite.SuiteClasses(value={SetXTest.class, FactorialTest.class, CalculationTest.class})
public class MainTest {
}
