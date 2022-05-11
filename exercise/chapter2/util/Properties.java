package exercise.chapter2.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class Properties {
  private HashMap<String, String> properties;

  public Properties() {
    this.properties = new HashMap<>();
  }

  public void load(InputStream in) throws IOException {
    // ファイルの中身を取り出して，hashに追加
  }

  public void store(OutputStream out, String header) throws IOException {
    // 現在のpropertyの情報を保存。
  }

  public void setProperty(String key, String value) {
    this.properties.put(key, value);
  }

  public String getProperty(String key) {
    return this.properties.get(key);
  }

}
