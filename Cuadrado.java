public class Cuadrado extends Figura{

  double base;
  double altura;

 public Cuadrado(double base, double altura){
  this.base = base;
  this.altura = altura;
 }
 
 @Override
 public double area(){
 	return this.base * this.altura;
 }
 
 @Override
 public double perimetro(){
 	return 2*this.base + 2 * this.altura;
 }
}
