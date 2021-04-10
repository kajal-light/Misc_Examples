package com.k1;

import com.k1.shape.Rectangle;
import com.k1.shape.RightAngleTriangle;

public class Main {

	public static void main(String[] args) {
		RightAngleTriangle one = new RightAngleTriangle(2, 3);

		System.out.println("the triangle area is" + one.area());

		System.out.println("the trianlge perimeter is" + one.perimeter());

		Rectangle oneR = new Rectangle(2, 3);


		System.out.println("the rectangle area is" + oneR.area());

		System.out.println("the rectangle perimeter is" + oneR.perimeter());
	}

}
