package androidx.emoji.text.EmojiProcessor$CodepointIndexFinder;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Character;

public final class EmojiProcessor$CodepointIndexFinder	// class@000752
{

    public void EmojiProcessor$CodepointIndexFinder(){
       super();
    }
    public static int findIndexBackward(CharSequence p0,int p1,int p2){
       int i = p0.length();
       if (p1 < 0 || i < p1) {
          return -1;
       }
       if (p2 < 0) {
          return -1;
       }
       i = 0;
       while (true) {
          boolean b = false;
          break ;
       }
       while (true) {
          if (!p2) {
             return p1;
          }
          p1--;
          if (p1 < 0) {
             if (b) {
                return -1;
             }
             return i;
          }else {
             char c = p0.charAt(p1);
             if (b) {
                if (!Character.isHighSurrogate(c)) {
                   return -1;
                }
                p2--;
             }else if(!Character.isSurrogate(c)){
                p2--;
             }else if(Character.isHighSurrogate(c)){
                break ;
             }else {
                b = true;
             }
          }
       }
       return -1;
    }
    public static int findIndexForward(CharSequence p0,int p1,int p2){
       int i = p0.length();
       if (p1 < 0 || i < p1) {
          return -1;
       }
       if (p2 < 0) {
          return -1;
       }
       int i1 = 0;
       while (true) {
          boolean b = false;
          break ;
       }
       while (true) {
          if (!p2) {
             return p1;
          }
          if (p1 >= i) {
             if (b) {
                return -1;
             }
             return i;
          }else {
             char c = p0.charAt(p1);
             if (b) {
                if (!Character.isLowSurrogate(c)) {
                   return -1;
                }
                p2--;
                p1++;
             }else if(!Character.isSurrogate(c)){
                p2--;
                p1++;
             }else if(Character.isLowSurrogate(c)){
                break ;
             }else {
                p1++;
                b = true;
             }
          }
       }
       return -1;
    }
}
