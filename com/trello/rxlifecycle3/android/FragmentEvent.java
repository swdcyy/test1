package com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FragmentEvent extends Enum	// class@000fdf
{
    public static final FragmentEvent[] $VALUES;
    public static final FragmentEvent ATTACH;
    public static final FragmentEvent CREATE;
    public static final FragmentEvent CREATE_VIEW;
    public static final FragmentEvent DESTROY;
    public static final FragmentEvent DESTROY_VIEW;
    public static final FragmentEvent DETACH;
    public static final FragmentEvent PAUSE;
    public static final FragmentEvent RESUME;
    public static final FragmentEvent START;
    public static final FragmentEvent STOP;

    static {
       FragmentEvent uFragmentEve = new FragmentEvent("ATTACH", 0);
       FragmentEvent.ATTACH = uFragmentEve;
       FragmentEvent uFragmentEve1 = new FragmentEvent("CREATE", 1);
       FragmentEvent.CREATE = uFragmentEve1;
       FragmentEvent uFragmentEve2 = new FragmentEvent("CREATE_VIEW", 2);
       FragmentEvent.CREATE_VIEW = uFragmentEve2;
       FragmentEvent uFragmentEve3 = new FragmentEvent("START", 3);
       FragmentEvent.START = uFragmentEve3;
       FragmentEvent uFragmentEve4 = new FragmentEvent("RESUME", 4);
       FragmentEvent.RESUME = uFragmentEve4;
       FragmentEvent uFragmentEve5 = new FragmentEvent("PAUSE", 5);
       FragmentEvent.PAUSE = uFragmentEve5;
       FragmentEvent uFragmentEve6 = new FragmentEvent("STOP", 6);
       FragmentEvent.STOP = uFragmentEve6;
       FragmentEvent uFragmentEve7 = new FragmentEvent("DESTROY_VIEW", 7);
       FragmentEvent.DESTROY_VIEW = uFragmentEve7;
       FragmentEvent uFragmentEve8 = new FragmentEvent("DESTROY", 8);
       FragmentEvent.DESTROY = uFragmentEve8;
       FragmentEvent uFragmentEve9 = new FragmentEvent("DETACH", 9);
       FragmentEvent.DETACH = uFragmentEve9;
       FragmentEvent[] uFragmentEve10 = new FragmentEvent[10];
       uFragmentEve10[0] = uFragmentEve;
       uFragmentEve10[1] = uFragmentEve1;
       uFragmentEve10[2] = uFragmentEve2;
       uFragmentEve10[3] = uFragmentEve3;
       uFragmentEve10[4] = uFragmentEve4;
       uFragmentEve10[5] = uFragmentEve5;
       uFragmentEve10[6] = uFragmentEve6;
       uFragmentEve10[7] = uFragmentEve7;
       uFragmentEve10[8] = uFragmentEve8;
       uFragmentEve10[9] = uFragmentEve9;
       FragmentEvent.$VALUES = uFragmentEve10;
    }
    public void FragmentEvent(String p0,int p1){
       super(p0, p1);
    }
    public static FragmentEvent valueOf(String p0){
       return Enum.valueOf(FragmentEvent.class, p0);
    }
    public static FragmentEvent[] values(){
       return FragmentEvent.$VALUES.clone();
    }
}
