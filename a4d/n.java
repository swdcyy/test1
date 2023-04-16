package a4d.n;
import erd.o;
import java.lang.String;
import java.lang.Object;
import bk5.c;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import brd.t;

public final class n implements o	// class@000091
{
    public final String b;

    public void n(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Matcher matcher = Pattern.compile((p0.a).replace("[", "\\[")).matcher(this.b);
       ArrayList uArrayList = new ArrayList();
       while (matcher.find()) {
          uArrayList.add(p0);
       }
       return t.just(uArrayList);
    }
}
