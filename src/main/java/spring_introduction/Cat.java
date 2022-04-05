package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")  // Cat -> cat (default bean); CatCat -> catCat (default bean); SQLcat -> SQLcat (default bean)
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say(){
        System.out.println("Meow-Meow");
    }
}
