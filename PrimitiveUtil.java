public class PrimitiveUtil{
  public static double toDouble(Object o)
  {
    double r;
    if(o instanceof Boolean){
      boolean b=(boolean)o;
      r=b?1:0;
    }else if(o instanceof Character) r=(char)o;
    else if(o instanceof Byte) r=(byte)o;
    else if(o instanceof Float) r=(float)o;
    else if(o instanceof Double) r=(double)o;
    else if(o instanceof Short) r=(short)o;
    else if(o instanceof Integer) r=(int)o;
    else if(o instanceof Long) r=(long)o;
    else if(o instanceof Void) r=0;
    else if(o==null) r=0;
    else throw new RuntimeException("o must be primitive");
    return r;
  }
  public static float toFloat(Object o)

  {

    float r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(float)(char)o;

    else if(o instanceof Byte) r=(float)(byte)o;

    else if(o instanceof Float) r=(float)o;

    else if(o instanceof Double) r=(float)(double)o;

    else if(o instanceof Short) r=(float)(short)o;

    else if(o instanceof Integer) r=(float)(int)o;

    else if(o instanceof Long) r=(float)(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static byte toByte(Object o)

  {

    byte r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(byte)(char)o;

    else if(o instanceof Byte) r=(byte)o;

    else if(o instanceof Float) r=(byte)(float)o;

    else if(o instanceof Double) r=(byte)(double)o;

    else if(o instanceof Short) r=(byte)(short)o;

    else if(o instanceof Integer) r=(byte)(int)o;

    else if(o instanceof Long) r=(byte)(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static char toChar(Object o)

  {

    char r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(char)o;

    else if(o instanceof Byte) r=(char)(byte)o;

    else if(o instanceof Float) r=(char)(float)o;

    else if(o instanceof Double) r=(char)(double)o;

    else if(o instanceof Short) r=(char)(short)o;

    else if(o instanceof Integer) r=(char)(int)o;

    else if(o instanceof Long) r=(char)(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static boolean toBoolean(Object o)

  {

    boolean r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b;

    }else if(o instanceof Character) r=(char)o!=0;

    else if(o instanceof Byte) r=(byte)o!=0;

    else if(o instanceof Float) r=(float)o!=0;

    else if(o instanceof Double) r=(double)o!=0;

    else if(o instanceof Short) r=(short)o!=0;

    else if(o instanceof Integer) r=(int)o!=0;

    else if(o instanceof Long) r=(long)o!=0;

    else if(o instanceof Void) r=false;

    else if(o==null) r=false;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static short toShort(Object o)

  {

    short r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(short)(char)o;

    else if(o instanceof Byte) r=(short)(byte)o;

    else if(o instanceof Float) r=(short)(float)o;

    else if(o instanceof Double) r=(short)(double)o;

    else if(o instanceof Short) r=(short)o;

    else if(o instanceof Integer) r=(short)(int)o;

    else if(o instanceof Long) r=(short)(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static int toInt(Object o)

  {

    int r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(int)(char)o;

    else if(o instanceof Byte) r=(int)(byte)o;

    else if(o instanceof Float) r=(int)(float)o;

    else if(o instanceof Double) r=(int)(double)o;

    else if(o instanceof Short) r=(int)(short)o;

    else if(o instanceof Integer) r=(int)o;

    else if(o instanceof Long) r=(int)(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
  public static long toLong(Object o)

  {

    long r;

    if(o instanceof Boolean){

      boolean b=(boolean)o;

      r=b?1:0;

    }else if(o instanceof Character) r=(long)(char)o;

    else if(o instanceof Byte) r=(long)(byte)o;

    else if(o instanceof Float) r=(long)(float)o;

    else if(o instanceof Double) r=(long)(double)o;

    else if(o instanceof Short) r=(long)(short)o;

    else if(o instanceof Integer) r=(long)(int)o;

    else if(o instanceof Long) r=(long)o;

    else if(o instanceof Void) r=0;

    else if(o==null) r=0;

    else throw new RuntimeException("o must be primitive");

    return r;

  }
}
