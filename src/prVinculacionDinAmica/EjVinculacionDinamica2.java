package prVinculacionDinAmica;


class Uno2 {
	public int test() { return 1; }
	public int resultado1() { 
		return this.test(); 
	}
}

class Dos2 extends Uno2 {
	public int test() { return 2; }
}

class Tres2 extends Dos2 {
	public int resultado2() { return this.resultado1(); }
	public int resultado3() { return super.test(); }
	public int test() { return 3; }
}

class Cuatro2 extends Tres2 {
	public int test() { return 4; }
}

public class EjVinculacionDinamica2{
	public static void main(String[] args) {
		Tres2   obj3 = new Tres2();
		Cuatro2 obj4 = new Cuatro2();
		System.out.println("obj3.test()       = " + obj3.test());
		System.out.println("obj3.resultado2() = " + obj3.resultado2());
		System.out.println("obj3.resultado3() = " + obj3.resultado3());
		System.out.println("obj4.resultado1() = " + obj4.resultado1());
		System.out.println("obj4.resultado2() = " + obj4.resultado2());
		System.out.println("obj4.resultado3() = " + obj4.resultado3());
	}
}
