// Viral Dangar
// Prapare Junit test case with given below @annotation
//    @Beforeclass
//   @Afterclass
//@Beforeeach
// @Aftereach
//  @Test

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {
    @BeforeClass
        public static void preClass() {
            System.out.println("Hello I Am @BeforeClass");
        }

        @BeforeEach
        public void setUp() {
            System.out.println("Hello I am Setting up Class  ");
        }

        @Test
        public void Test1() {
            System.out.println("Testing1");
        }

        @Test
        public void Test2() {

            System.out.println("Testing2");
        }


        @AfterEach
        public void tearDown() {
            System.out.println("After Complete Execution of One Class");     }

        @AfterAll
        public static void postClass() {
            System.out.println("All Class Are Runs Successful");
        }
    }

