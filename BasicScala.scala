/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    var url = "";
    if (params.isEmpty)
      {
        return url;
      }
    url = url.concat("?")
    for ((key,value)<-params){
      url = url.concat(key+"="+value+"&")
    }
    url.substring(0,url.lastIndexOf("&"))
  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = {
    val regex = "\\w+@\\w+(\\.\\w+)*\\.\\w{2,3}";
    maybeEmail.matches(regex)
  }


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    var result : Int = 1;
    for ( _<-0 until n)
      {
        result *= i;
      }
    result
  }

  def main(args: Array[String]){
    println("hello world");
    println(power(99,38997));
    val map = Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    println(encodeParamsInUrl(map))
    println(isEmail("sdad_ass@utt.fr"))
    println(isEmail("sdad_ass@mail.sina.fr"))
    println(isEmail("sdadass@utt.fraaa"))
  }


}
