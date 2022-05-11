package exercise.chapter2.adapters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import exercise.chapter2.interfaces.FileIO;
import exercise.chapter2.util.Properties;

public class FileProperties extends Properties implements FileIO {
  public FileProperties() {
    super();
  }

  public void readFromFile(String filename) {
    try {
      load(new FileInputStream(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void writeToFile(String filename) {
    try {
      store(new FileOutputStream(filename), "#Written by FileProperties");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setValue(String key, String value) {
    setValue(key, value);
  }

  public String getValue(String key) {
    return getProperty(key);
  }
}
