package a2.q;
import android.view.MotionEvent;

public final class q	// class@000098
{
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 22;
    public static final int G = 23;
    public static final int H = 24;
    public static final int I = 25;
    public static final int J = 32;
    public static final int K = 33;
    public static final int L = 34;
    public static final int M = 35;
    public static final int N = 36;
    public static final int O = 37;
    public static final int P = 38;
    public static final int Q = 39;
    public static final int R = 40;
    public static final int S = 41;
    public static final int T = 42;
    public static final int U = 43;
    public static final int V = 44;
    public static final int W = 45;
    public static final int X = 46;
    public static final int Y = 47;
    public static final int Z = 1;
    public static final int a = 255;
    public static final int b = 5;
    public static final int c = 6;
    public static final int d = 7;
    public static final int e = 8;
    public static final int f = 65280;
    public static final int g = 8;
    public static final int h = 9;
    public static final int i = 10;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;
    public static final int o = 5;
    public static final int p = 6;
    public static final int q = 7;
    public static final int r = 8;
    public static final int s = 9;
    public static final int t = 10;
    public static final int u = 11;
    public static final int v = 12;
    public static final int w = 13;
    public static final int x = 14;
    public static final int y = 15;
    public static final int z = 16;

    public static int a(MotionEvent p0,int p1){
       return p0.findPointerIndex(p1);
    }
    public static int b(MotionEvent p0){
       return p0.getActionIndex();
    }
    public static int c(MotionEvent p0){
       return p0.getActionMasked();
    }
    public static int d(MotionEvent p0){
       return p0.getPointerCount();
    }
    public static int e(MotionEvent p0,int p1){
       return p0.getPointerId(p1);
    }
    public static float f(MotionEvent p0,int p1){
       return p0.getX(p1);
    }
    public static float g(MotionEvent p0,int p1){
       return p0.getY(p1);
    }
    public static boolean h(MotionEvent p0,int p1){
       boolean b = ((p0.getSource() & p1) == p1)? true: false;
       return b;
    }
}
