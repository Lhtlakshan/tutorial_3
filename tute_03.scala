

object tute_03 {
  

  
  //01
  
  
  
  
  
 
  //01
  
  def area(r:Double):Double=
  {
    var area = 22/7*r*r;
    return area
  }
  
  println(area(5))
  
  //02
  
  def celciusTofahrenheit(T:Double):Double=
  {
    var F = T*1.8 + 32.0
    return F
  }
  
  println(celciusTofahrenheit(35))
  
  //03
  
  def volume(r:Double):Double=
  {
    var volume = 22/7*r*r;
    return volume
  }
  
  println(volume(5))
  
  //04
  
  def wholesale(coverPrice:Double,copies:Int):Double=
  {
    var d = coverPrice*40/100
    if(copies>50)
    {
      var s1= 3*(50)
      var s2 = 0.75*(copies - 50)
      
      var c1 = copies*(coverPrice-d)+s1+s2
      
      return c1
           
    }
    else
    {
      var s = 3*copies
      
      var c2 = copies*(coverPrice-d) + s
      
      return c2
      
    }
    
   
  }
  
 wholesale(24.95, 60) 
  
 //05
 
 def totalRuntime(easypace:Int,tempo:Int):Int=
 {
   var e = easypace * 8
   var t = tempo*7
   
   var total = e+ t
   
   return total
   
   
 }
 
 totalRuntime(4,3)

}

