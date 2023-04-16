package androidx.core.view.ScrollStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ScrollStrategy extends Enum	// class@000719
{
    public static final ScrollStrategy[] $VALUES;
    public static final ScrollStrategy DISABLE_ALL_TOUCH;
    public static final ScrollStrategy ONLY_FIRST_TWO_TOUCH_SCROLL;

    static {
       ScrollStrategy scrollStrate = new ScrollStrategy("DISABLE_ALL_TOUCH", 0);
       ScrollStrategy.DISABLE_ALL_TOUCH = scrollStrate;
       ScrollStrategy scrollStrate1 = new ScrollStrategy("ONLY_FIRST_TWO_TOUCH_SCROLL", 1);
       ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL = scrollStrate1;
       ScrollStrategy[] scrollStrate2 = new ScrollStrategy[]{scrollStrate,scrollStrate1};
       ScrollStrategy.$VALUES = scrollStrate2;
    }
    public void ScrollStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static ScrollStrategy valueOf(String p0){
       return Enum.valueOf(ScrollStrategy.class, p0);
    }
    public static ScrollStrategy[] values(){
       return ScrollStrategy.$VALUES.clone();
    }
}
