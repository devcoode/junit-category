package category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(SlowTests.class)
@Suite.SuiteClasses(RunAllTests.class)
public class FastTestOnly {
}
