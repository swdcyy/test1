package com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils;
import java.util.HashMap;
import java.lang.String;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$a;
import java.lang.Object;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Matcher;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$VideoCommentEggModel;
import java.lang.reflect.Type;

public class VideoCommentEggUtils	// class@001103
{
    public static VideoCommentEggUtils$VideoCommentEggModel a;
    public static boolean b;
    public static final HashMap c;
    public static Pattern d;
    public static final e e;

    static {
       VideoCommentEggUtils.c = new HashMap();
       VideoCommentEggUtils.d = Pattern.compile("\(@[^@\\\(]+?\)\\\(O\(\\d+\)\\\)");
       VideoCommentEggUtils.e = new VideoCommentEggUtils$a();
    }
    public void VideoCommentEggUtils(){
       super();
    }
    public static boolean a(VideoCommentEggUtils$b p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, VideoCommentEggUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (TextUtils.x(p1)) {
          return false;
       }
       HashMap c = VideoCommentEggUtils.c;
       Pattern pattern = c.get(p0.matcher);
       if (pattern == null) {
          pattern = Pattern.compile(p0.matcher);
          c.put(p0.matcher, pattern);
       }
       String str = VideoCommentEggUtils.d.matcher(p1).replaceAll("");
       if (TextUtils.n(str, p1) && p0.needContainerAt != null) {
          return false;
       }else {
          return pattern.matcher(str).find();
       }
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, VideoCommentEggUtils.class, "2")) {
          return;
       }
       VideoCommentEggUtils.a = a.t().getValue("commentSendVideoEggs", VideoCommentEggUtils$VideoCommentEggModel.class, null);
       return;
    }
}
