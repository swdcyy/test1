package ek9.l1;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.Map;
import com.yxcorp.gifshow.comment.config.RecommendGodComment;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class l1	// class@00218d
{
    public static final SharedPreferences a;

    static {
       l1.a = b.b("DefaultPreferenceHelper");
    }
    public static boolean a(){
       return l1.a.getBoolean("atGuideBubbleShown", false);
    }
    public static Map b(Type p0){
       String str = l1.a.getString("commentFrequencyControlHelper", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int c(){
       return l1.a.getInt("godCommentShowType", 0);
    }
    public static boolean d(){
       return l1.a.getBoolean("hasShownCommentThumbsDownGuideBubble", false);
    }
    public static boolean e(){
       return l1.a.getBoolean("isShowCommentComboBubble", false);
    }
    public static RecommendGodComment f(Type p0){
       String str = l1.a.getString("OneClickRecommendGodComment", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int g(){
       return l1.a.getInt("recommendGodCommentGuideCount", 0);
    }
    public static void h(boolean p0){
       SharedPreferences$Editor uEditor = l1.a.edit();
       uEditor.putBoolean("isShowCommentComboBubble", p0);
       g.a(uEditor);
    }
}
