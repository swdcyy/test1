package apd.d;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import java.lang.String;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.plugin.kwaitoken.model.TachTemplateDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.kwaitoken.model.CustomDialogInfo;
import com.yxcorp.plugin.kwaitoken.model.OnePictureDialogInfo;
import com.yxcorp.plugin.kwaitoken.model.JumpDirectDialogInfo;
import com.yxcorp.plugin.kwaitoken.model.SimpleDialogInfo;
import com.yxcorp.plugin.kwaitoken.model.MultiPicsDialogInfo;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import java.lang.Float;
import com.yxcorp.plugin.kwaitoken.model.BigHeadDialogInfo;
import c97.d;
import r97.a0;
import r97.i0$a;
import r97.i0;
import r97.o$a;
import r97.o;
import com.yxcorp.plugin.kwaitoken.k;
import r97.t$a;
import r97.t;

public class d	// class@000212
{

    public static String a(BaseDialogInfo p0){
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("originKpn", p0.mOriginKpn);
       jsonObject.c0("originSubBiz", p0.mOriginSubBiz);
       jsonObject.c0("kpn", p0.mKpn);
       jsonObject.c0("subBiz", p0.mSubBiz);
       jsonObject.c0("kwaiUrl", p0.mKwaiUrl);
       BaseDialogInfo mExtParams = p0.mExtParams;
       if (mExtParams != null) {
          jsonObject.c0("extParams", mExtParams.toString());
       }
       jsonObject.a0("newShowTypes", Integer.valueOf(p0.mShowType));
       String str = "actionButtonText";
       switch (p0.mShowType){
           case 'd':
             if (p0 instanceof BigHeadDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
                jsonObject.c0("title", p0.mTitle);
                jsonObject.c0("subTitle", p0.mSubTitle);
                jsonObject.c0(str, p0.mActionButtonText);
             }
             break;
           case 'e':
             if (p0 instanceof BigPictureDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
                jsonObject.c0("title", p0.mTitle);
                jsonObject.c0("subTitle", p0.mSubTitle);
                jsonObject.c0(str, p0.mActionButtonText);
                jsonObject.a0("aspectRatio", Float.valueOf(p0.mAspectRatio));
             }
             break;
           case 'f':
             if (p0 instanceof MultiPicsDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
                jsonObject.c0("title", p0.mTitle);
                jsonObject.c0("subTitle", p0.mSubTitle);
                jsonObject.c0(str, p0.mActionButtonText);
             }
             break;
           case 'h':
             if (p0 instanceof SimpleDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
                jsonObject.c0("title", p0.mTitle);
             }
             break;
           case 'i':
             if (p0 instanceof JumpDirectDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("dialogKwaiUrl", p0.mDialogKwaiUrl);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
             }
             break;
           case 'j':
             if (p0 instanceof OnePictureDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
             }
             break;
           case 'k':
             if (p0 instanceof CustomDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
             }
             break;
           case 'm':
             if (p0 instanceof TachTemplateDialogInfo) {
                jsonObject.c0("shareId", p0.mShareId);
                jsonObject.c0("shareResourceType", p0.mShareResourceType);
                jsonObject.c0("shareObjectId", p0.mShareObjectId);
                jsonObject.c0("templateId", p0.mTachTemplateId);
                if (!TextUtils.x(p0.mTachItemId)) {
                   jsonObject.c0("tachItemId", p0.mTachItemId);
                }
             }
             break;
           default:
       }
    label_0161 :
       return jsonObject.toString();
    }
    public static void onTokenDialogClickEvent(String p0,BaseDialogInfo p1){
       i0$a uoa = i0.b();
       uoa.d(o.builder().i("AndroidKwaiToken").j(k.e).b());
       uoa.p("USER_OPERATION");
       uoa.k("CLICK");
       uoa.a(p0);
       uoa.l(d.a(p1));
       d.a().g().I(uoa.c());
    }
    public static void onTokenDialogShowEvent(BaseDialogInfo p0){
       String str = (p0 != null && p0.mShowType == 109)? "TOKEN_TACH_DIALOG_SHOW": "TOKEN_DIALOG_SHOW";
       t$a uoa = t.b();
       uoa.d(o.builder().i("AndroidKwaiToken").j(k.e).b());
       uoa.a(str);
       uoa.g(d.a(p0));
       d.a().g().k(uoa.c());
       return;
    }
}
