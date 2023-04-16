package ixd.b;
import java.lang.Math;
import java.lang.String;
import java.util.Locale;
import java.lang.Object;
import org.sqlite.database.sqlite.SQLiteDatabase;
import org.sqlite.database.sqlite.SQLiteStatement;
import org.sqlite.database.sqlite.SQLiteProgram;
import org.sqlite.database.sqlite.SQLiteClosable;

public class b	// class@001525
{
    public static final char[] a;
    public static Collator b;

    static {
       b.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       b.b = null;
    }
    public static int a(int p0,int p1){
       return Math.max((p0 - (p1 / 3)), 0);
    }
    public static int b(String p0){
       p0 = p0.trim();
       int i = 3;
       if (p0.length() < i) {
          return 99;
       }
       p0 = (p0.substring(0, i)).toUpperCase(Locale.ROOT);
       if (p0.equals("SEL")) {
          return 1;
       }
       if (!p0.equals("INS") && (!p0.equals("UPD") && (p0.equals("REP") || p0.equals("DEL")))) {
          return 2;
       }
       if (p0.equals("ATT")) {
          return i;
       }
       if (p0.equals("COM")) {
          return 5;
       }
       if (p0.equals("END")) {
          return 5;
       }
       if (p0.equals("ROL")) {
          return 6;
       }
       if (p0.equals("BEG")) {
          return 4;
       }
       if (p0.equals("PRA")) {
          return 7;
       }
       if (!p0.equals("CRE") && (p0.equals("DRO") || p0.equals("ALT"))) {
          return 8;
       }
       if (p0.equals("ANA") || p0.equals("DET")) {
          return 9;
       }
       return 99;
    }
    public static long c(SQLiteDatabase p0,String p1,String[] p2){
       SQLiteStatement sQLiteStatem = p0.compileStatement(p1);
       sQLiteStatem.bindAllArgsAsStrings(null);
       sQLiteStatem.close();
       return sQLiteStatem.simpleQueryForLong();
    }
}
