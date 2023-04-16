package androidx.viewpager.widget.SelectedReasonViewPager$c;
import java.lang.Object;
import java.util.LinkedList;
import androidx.viewpager.widget.SelectedReasonViewPager$a;
import java.lang.String;

public class SelectedReasonViewPager$c	// class@000a0c
{
    public final LinkedList a;

    public void SelectedReasonViewPager$c(){
       super();
       this.a = new LinkedList();
    }
    public void SelectedReasonViewPager$c(SelectedReasonViewPager$a p0){
       super();
    }
    public String a(){
       return this.a.getFirst();
    }
    public boolean b(){
       return (this.a.isEmpty() ^ 0x01);
    }
    public void c(){
       this.a.pop();
    }
    public void d(String p0){
       this.a.push(p0);
    }
}
