package com.loc.u;
import com.loc.t$c;
import com.loc.w;
import java.lang.Object;
import com.loc.u$1;
import java.lang.Enum;
import java.lang.String;

public final class u	// class@00146d
{
    public final t$c a;
    public final String b;

    public void u(t$c p0,w p1){
       Object[] objArray;
       String str;
       super();
       this.a = p0;
       switch (u$1.a[p0.ordinal()]){
           case 1:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请设置隐私权政策是否弹窗告知用户", objArray);
             break;
           case 2:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已弹窗告知用户", objArray);
             break;
           case 3:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策", objArray);
             break;
           case 4:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策", objArray);
             break;
           case 5:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否取得用户同意", objArray);
             break;
           case 6:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已取得用户同意", objArray);
             break;
           case 7:
             objArray = new Object[]{p1.a()};
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。", objArray);
             break;
           case 8:
             objArray = new Object[0];
             str = String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n参数非法，context 或 sdkInfo为空", objArray);
             break;
           case 9:
             objArray = new Object[0];
             str = String.format("设置隐私政策成功", objArray);
             break;
           default:
             str = "";
       }
       this.b = str;
       return;
    }
}
