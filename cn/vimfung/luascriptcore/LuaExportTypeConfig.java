package cn.vimfung.luascriptcore.LuaExportTypeConfig;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract LuaExportTypeConfig implements Annotation	// class@000d3a
{

    String[] excludeExportClassMethodNames();
    String[] excludeExportFieldNames();
    String[] excludeExportInstanceMethodsNames();
}
