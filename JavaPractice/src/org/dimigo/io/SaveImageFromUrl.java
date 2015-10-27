/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_ SaveImageFromUrl
 * 
 * 개요 : 
 * 작성일 : 2015. 10. 22.
 * </pre>
 * 
 * 
 * @author jeongukjae
 * @version : 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imageUrl = "https://images.unsplash.com/photo-1445251836269-d158eaa028a6?dpr=2&fit=crop&fm=jpg&h=925&q=50&w=1475";
		try {
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/photo.png");
			
			int result;
			byte[] buffer = new byte[1024];
			while((result = is.read(buffer)) != -1) {
				os.write(buffer, 0, result);
			}
			os.close();
			is.close();
			
			System.out.println("이미지 다운 성공");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
