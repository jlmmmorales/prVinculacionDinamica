package prVinculacionDinAmica;

class Uno1 {
	public int test() { return 1; }
	public int resultado1() { 
		return this.test(); 
	}
}

class Dos1 extends Uno1 {
	public int test() { return 2; }
}

class Tres1 extends Dos1 {
	public int resultado2() { return this.resultado1(); }
	public int resultado3() { return super.test(); }
}

class Cuatro1 extends Tres1 {
	public int test() { return 4; }
}

public class EjVinculacionDinamica1 {
	public static void main(String[] args) {
		Tres1   obj3 = new Tres1();
		Cuatro1 obj4 = new Cuatro1();
		System.out.println("obj3.test()       = " + obj3.test());
		System.out.println("obj3.resultado2() = " + obj3.resultado2());
		System.out.println("obj3.resultado3() = " + obj3.resultado3());
		System.out.println("obj4.resultado1() = " + obj4.resultado1());
		System.out.println("obj4.resultado2() = " + obj4.resultado2());
		System.out.println("obj4.resultado3() = " + obj4.resultado3());
	}
}
