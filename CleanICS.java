String fileName = "c://....com.ics";
String outputFileName = "c://clean-...com.ics";
String badDate = "CREATED:20170723T082904Z";

BufferedReader br = null;
String everything = "";
try {
	boolean seenDate = false;
	br = new BufferedReader(new FileReader(fileName));
	StringBuilder sb = new StringBuilder();
	String line = br.readLine();

	while (line != null) {
		if(line.equals(badDate))
			seenDate = true;
		if(seenDate && line.contains("STATUS:")) {
			sb.append("STATUS:CANCELLED");
			seenDate = false;
		}
		else
			sb.append(line);
		sb.append(System.lineSeparator());
		line = br.readLine();
	}
	everything = sb.toString();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
} finally {
	try {
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

try{
	PrintWriter writer = new PrintWriter(outputFileName, "UTF-8");
	writer.write(everything);
	writer.close();
} catch (IOException e) {
	// do something
}String fileName = "c://liraz@theculturetrip.com.ics";
String outputFileName = "c://clean-liraz@theculturetrip.com.ics";
String badDate = "CREATED:20170723T082904Z";

BufferedReader br = null;
String everything = "";
try {
	boolean seenDate = false;
	br = new BufferedReader(new FileReader(fileName));
	StringBuilder sb = new StringBuilder();
	String line = br.readLine();

	while (line != null) {
		if(line.equals(badDate))
			seenDate = true;
		if(seenDate && line.contains("STATUS:")) {
			sb.append("STATUS:CANCELLED");
			seenDate = false;
		}
		else
			sb.append(line);
		sb.append(System.lineSeparator());
		line = br.readLine();
	}
	everything = sb.toString();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
} finally {
	try {
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

try{
	PrintWriter writer = new PrintWriter(outputFileName, "UTF-8");
	writer.write(everything);
	writer.close();
} catch (IOException e) {
	// do something
}
