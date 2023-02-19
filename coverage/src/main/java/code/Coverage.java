package code;

public final class Coverage {
  private Coverage() {}

  public static boolean methodA(boolean a) {
    if (a) {
      System.out.println("methodA:a");
      return true;
    }
    return false;
  }

  public static boolean methodAB(boolean a, boolean b) {
    if (a) {
      System.out.println("methodAB:a");
      return true;
    }

    if (b) {
      System.out.println("methodAB:b");
      return true;
    }
    return false;
  }

  public static boolean methodABC(boolean a, boolean b, boolean c) {
    if (a) {
      System.out.println("methodABC:a");
      return a;
    }

    if (b) {
      System.out.println("methodABC:b");
        return b;
    }

    if (c) {
      System.out.println("methodABC:c");
        return c;
    }
    return false;
  }

  public static boolean methodOrAB(boolean a, boolean b) {
    if (a || b) {
        System.out.println("methodOrAB:a || b");
        return a || b;
    } else {
        System.out.println("methodOrAB:!(a || b)");
        return false;
    }
  }

  public static boolean methodAndAB(boolean a, boolean b) {
    if (a && b) {
        System.out.println("methodOrAB:a && b");
        return true;
    } else {
        System.out.println("methodOrAB:!(a && b)");
        return false;
    }
  }

  public static boolean methodOrABC(boolean a, boolean b, boolean c) {
    if (a || b || c) {
      System.out.println("methodOrAB:a || b || c");
      return true;
    } else {
      System.out.println("methodOrAB:!(a || b || c)");
      return false;
    }
  }

  public static boolean methodAndABC(boolean a, boolean b, boolean c) {
    if (a && b && c) {
      System.out.println("methodOrAB:a && b && c");
      return true;
    } else {
      System.out.println("methodOrAB:!(a && b && c)");
      return false;
    }
  }

  public static boolean methodOrABCD(boolean a, boolean b, boolean c, boolean d) {
    if (a || b || c || d) {
      System.out.println("methodOrABCD:a || b || c || d");
      return true;
    } else {
      System.out.println("methodOrABCD:!(a || b || c || d)");
      return false;
    }
  }

  public static boolean methodAndABCD(boolean a, boolean b, boolean c, boolean d) {
    if (a && b && c && d) {
      System.out.println("methodAndABCD:a && b && c && d");
        return true;
    } else {
      System.out.println("methodAndABCD:!(a && b && c && d)");
        return false;
    }
  }

}
