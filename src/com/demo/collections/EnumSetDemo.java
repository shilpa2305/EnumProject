package com.demo.collections;

import java.util.EnumSet;

enum MyEnum{
	Shilpa, Pawan, Meow, Poochku
};
public class EnumSetDemo {

	public static void main(String[] args) {
		EnumSet<MyEnum> enumSet1, enumSet2;
		enumSet1 = EnumSet.of(MyEnum.Pawan,MyEnum.Shilpa,MyEnum.Poochku);
		enumSet2 = EnumSet.complementOf(enumSet1);
		System.out.println("Set 1: " + enumSet1); 
        System.out.println("Set 2: " + enumSet2);
        //class EnumSet<E extends Enum<E>>
        //static <E extends Enum<E>> EnumSet<E> of(E v, E … varargs)
	}

}
