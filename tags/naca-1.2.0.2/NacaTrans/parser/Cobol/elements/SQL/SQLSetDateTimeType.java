/*
 * NacaTrans - Naca Transcoder v1.2.0.
 *
 * Copyright (c) 2008-2009 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
/*
 * NacaRTTests - Naca Tests for NacaRT support.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
/**
 * 
 */
package parser.Cobol.elements.SQL;

/**
 *
 * @author Pierre-Jean Ditscheid, Consultas SA
 * @version $Id$
 */
public class SQLSetDateTimeType
{ 
	public static SQLSetDateTimeType Date = new SQLSetDateTimeType();
	public static SQLSetDateTimeType Time = new SQLSetDateTimeType();
	public static SQLSetDateTimeType TimeStamp = new SQLSetDateTimeType();
	
	private SQLSetDateTimeType()
	{
	}
}