package j79.n0;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import java.lang.Object;

public final class n0 implements ViewPager$i	// class@002784
{
    public final PreviewViewPager b;

    public void n0(PreviewViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       this.b.d = p0;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
