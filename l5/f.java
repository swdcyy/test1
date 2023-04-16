package l5.f;
import l5.s;
import java.lang.Object;
import android.util.JsonReader;
import com.airbnb.lottie.ex.model.DocumentData$Justification;
import java.lang.String;
import java.util.Objects;
import l5.j;
import java.lang.Enum;
import com.airbnb.lottie.ex.model.DocumentData;

public class f implements s	// class@00251c
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public Object a(JsonReader p0,float p1){
       p0.beginObject();
       DocumentData$Justification justificatio = DocumentData$Justification.CENTER;
       String str = null;
       String str1 = str;
       double d = 0;
       double d1 = d;
       double d2 = d1;
       double d3 = d2;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       boolean b = true;
       while (p0.hasNext()) {
          String str2 = p0.nextName();
          Objects.requireNonNull(str2);
          int i3 = -1;
          switch (str2.hashCode()){
              case 'f':
                if (str2.equals("f")) {
                   i3 = 0;
                }
                break;
              case 'j':
                if (str2.equals("j")) {
                   i3 = 1;
                }
                break;
              case 's':
                if (str2.equals("s")) {
                   i3 = 2;
                }
                break;
              case 't':
                if (str2.equals("t")) {
                   i3 = 3;
                }
                break;
              case 3261:
                if (str2.equals("fc")) {
                   i3 = 4;
                }
                break;
              case 3452:
                if (str2.equals("lh")) {
                   i3 = 5;
                }
                break;
              case 3463:
                if (str2.equals("ls")) {
                   i3 = 6;
                }
                break;
              case 3543:
                if (str2.equals("of")) {
                   i3 = 7;
                }
                break;
              case 3664:
                if (str2.equals("sc")) {
                   i3 = 8;
                }
                break;
              case 3684:
                if (str2.equals("sw")) {
                   i3 = 9;
                }
                break;
              case 3710:
                if (str2.equals("tr")) {
                   i3 = 10;
                }
                break;
              default:
          }
          switch (i3){
              case 0:
                str1 = p0.nextString();
                break;
              case 1:
                int i4 = p0.nextInt();
                justificatio = DocumentData$Justification.CENTER;
                if (i4 > justificatio.ordinal() || i4 < 0) {
                   continue ;
                }else {
                   justificatio = DocumentData$Justification.values()[i4];
                }
                break;
              case 2:
                d = p0.nextDouble();
                break;
              case 3:
                str = p0.nextString();
                break;
              case 4:
                i1 = j.a(p0);
                break;
              case 5:
                d1 = p0.nextDouble();
                break;
              case 6:
                d2 = p0.nextDouble();
                break;
              case 7:
                b = p0.nextBoolean();
                break;
              case 8:
                i2 = j.a(p0);
                break;
              case 9:
                d3 = p0.nextDouble();
                break;
              case 10:
                i = p0.nextInt();
                break;
              default:
                p0.skipValue();
          }
       }
       p0.endObject();
       DocumentData uDocumentDat = new DocumentData(str, str1, d, justificatio, i, d1, d2, i1, i2, d3, b);
       return v0;
    }
}
