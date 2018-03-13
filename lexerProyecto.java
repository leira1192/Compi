/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Daniela/Desktop/Compi/lexerProyecto.flex</tt>
 */
class lexerProyecto {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\55\1\3\1\1\22\0\1\3\1\47\3\0"+
    "\1\54\1\50\1\0\1\35\1\36\1\5\1\52\1\44\1\53\1\7"+
    "\1\4\12\6\1\0\1\43\1\46\1\45\1\46\2\0\32\10\1\41"+
    "\1\0\1\42\3\0\1\16\1\11\1\22\1\32\1\15\1\25\1\34"+
    "\1\24\1\30\1\10\1\17\1\13\1\10\1\27\1\12\1\31\1\10"+
    "\1\14\1\23\1\21\1\26\1\10\1\33\1\10\1\20\1\10\1\37"+
    "\1\51\1\40\7\0\1\55\u1fa2\0\1\55\1\55\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\4\1\5\16\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\1"+
    "\1\3\2\1\2\17\1\20\1\0\1\4\1\0\5\6"+
    "\1\21\10\6\1\22\3\6\1\23\2\6\1\24\3\6"+
    "\1\0\2\4\15\6\1\25\2\6\1\26\1\6\1\27"+
    "\5\6\1\0\2\4\1\30\1\6\1\31\2\6\1\32"+
    "\1\33\1\34\1\35\1\6\1\36\1\37\2\6\1\40"+
    "\1\41\4\6\1\42\1\0\1\43\4\6\1\44\3\6"+
    "\1\45\1\0\1\46\1\47\1\6\1\50\1\6\1\51"+
    "\2\6\1\52\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\56\0\212\0\56\0\270\0\56"+
    "\0\346\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228"+
    "\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\56\0\56"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\u036a\0\u036a"+
    "\0\u0398\0\u03c6\0\u03f4\0\u0422\0\56\0\u0450\0\u047e\0\u04ac"+
    "\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592\0\346\0\u05c0\0\u05ee"+
    "\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\346\0\u0730"+
    "\0\u075e\0\u078c\0\346\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872"+
    "\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4\0\u09e2"+
    "\0\u0a10\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52"+
    "\0\u0b80\0\346\0\u0bae\0\u0bdc\0\346\0\u0c0a\0\346\0\u0c38"+
    "\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\56\0\346"+
    "\0\u0d7a\0\346\0\u0da8\0\u0dd6\0\346\0\346\0\346\0\346"+
    "\0\u0e04\0\346\0\346\0\u0e32\0\u0e60\0\346\0\346\0\u0e8e"+
    "\0\u0ebc\0\u0eea\0\u0f18\0\346\0\u0f46\0\346\0\u0f74\0\u0fa2"+
    "\0\u0fd0\0\u0ffe\0\346\0\u102c\0\u105a\0\u1088\0\346\0\u10b6"+
    "\0\346\0\346\0\u10e4\0\346\0\u1112\0\346\0\u1140\0\u116e"+
    "\0\346\0\346\0\346";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\2\11\1\13\1\14\3\11\1\15\1\16\1\17"+
    "\1\11\1\20\1\11\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\37\1\41\1\42\1\43\1\44"+
    "\1\6\1\45\60\0\1\4\60\0\1\46\56\0\1\47"+
    "\1\50\54\0\1\11\1\0\25\11\27\0\1\11\1\0"+
    "\2\11\1\51\1\11\1\52\3\11\1\53\14\11\27\0"+
    "\1\11\1\0\5\11\1\54\17\11\27\0\1\11\1\0"+
    "\3\11\1\55\21\11\27\0\1\11\1\0\2\11\1\56"+
    "\1\11\1\57\7\11\1\60\10\11\27\0\1\11\1\0"+
    "\2\11\1\61\3\11\1\62\5\11\1\63\10\11\27\0"+
    "\1\11\1\0\23\11\1\64\1\11\27\0\1\11\1\0"+
    "\2\11\1\65\3\11\1\66\6\11\1\67\1\70\6\11"+
    "\27\0\1\11\1\0\5\11\1\71\10\11\1\72\6\11"+
    "\27\0\1\11\1\0\15\11\1\73\1\11\1\74\5\11"+
    "\27\0\1\11\1\0\4\11\1\75\20\11\27\0\1\11"+
    "\1\0\2\11\1\76\2\11\1\77\17\11\27\0\1\11"+
    "\1\0\14\11\1\100\10\11\27\0\1\11\1\0\2\11"+
    "\1\101\22\11\66\0\1\6\60\0\1\6\56\0\1\6"+
    "\56\0\1\6\56\0\1\6\7\0\1\102\56\0\1\103"+
    "\1\50\54\0\1\104\55\0\1\11\1\0\2\11\1\105"+
    "\22\11\27\0\1\11\1\0\5\11\1\106\17\11\27\0"+
    "\1\11\1\0\11\11\1\107\13\11\27\0\1\11\1\0"+
    "\11\11\1\110\7\11\1\111\3\11\27\0\1\11\1\0"+
    "\13\11\1\112\11\11\27\0\1\11\1\0\16\11\1\113"+
    "\6\11\27\0\1\11\1\0\5\11\1\114\12\11\1\115"+
    "\4\11\27\0\1\11\1\0\17\11\1\116\5\11\27\0"+
    "\1\11\1\0\13\11\1\117\11\11\27\0\1\11\1\0"+
    "\6\11\1\120\16\11\27\0\1\11\1\0\20\11\1\121"+
    "\4\11\27\0\1\11\1\0\4\11\1\122\20\11\27\0"+
    "\1\11\1\0\3\11\1\123\21\11\27\0\1\11\1\0"+
    "\17\11\1\124\5\11\27\0\1\11\1\0\23\11\1\125"+
    "\1\11\27\0\1\11\1\0\3\11\1\126\21\11\27\0"+
    "\1\11\1\0\11\11\1\127\13\11\27\0\1\11\1\0"+
    "\20\11\1\130\4\11\27\0\1\11\1\0\16\11\1\131"+
    "\6\11\27\0\1\11\1\0\15\11\1\132\7\11\27\0"+
    "\1\11\1\0\20\11\1\133\4\11\27\0\1\11\1\0"+
    "\11\11\1\134\13\11\21\0\5\135\1\0\50\135\6\0"+
    "\1\136\1\50\54\0\1\137\55\0\1\11\1\0\3\11"+
    "\1\140\21\11\27\0\1\11\1\0\6\11\1\141\16\11"+
    "\27\0\1\11\1\0\5\11\1\142\17\11\27\0\1\11"+
    "\1\0\16\11\1\143\6\11\27\0\1\11\1\0\5\11"+
    "\1\144\17\11\27\0\1\11\1\0\5\11\1\145\17\11"+
    "\27\0\1\11\1\0\5\11\1\146\17\11\27\0\1\11"+
    "\1\0\17\11\1\147\5\11\27\0\1\11\1\0\13\11"+
    "\1\150\11\11\27\0\1\11\1\0\11\11\1\151\13\11"+
    "\27\0\1\11\1\0\5\11\1\152\17\11\27\0\1\11"+
    "\1\0\4\11\1\153\20\11\27\0\1\11\1\0\11\11"+
    "\1\154\13\11\27\0\1\11\1\0\13\11\1\155\11\11"+
    "\27\0\1\11\1\0\12\11\1\156\12\11\27\0\1\11"+
    "\1\0\3\11\1\157\21\11\27\0\1\11\1\0\17\11"+
    "\1\160\5\11\27\0\1\11\1\0\1\11\1\161\23\11"+
    "\27\0\1\11\1\0\6\11\1\162\16\11\27\0\1\11"+
    "\1\0\3\11\1\163\21\11\27\0\1\11\1\0\2\11"+
    "\1\164\22\11\21\0\5\135\1\165\50\135\7\0\1\50"+
    "\54\0\1\11\1\0\7\11\1\166\15\11\27\0\1\11"+
    "\1\0\4\11\1\167\20\11\27\0\1\11\1\0\6\11"+
    "\1\170\16\11\27\0\1\11\1\0\20\11\1\171\4\11"+
    "\27\0\1\11\1\0\12\11\1\172\12\11\27\0\1\11"+
    "\1\0\5\11\1\173\17\11\27\0\1\11\1\0\11\11"+
    "\1\174\13\11\27\0\1\11\1\0\3\11\1\175\21\11"+
    "\27\0\1\11\1\0\16\11\1\176\6\11\27\0\1\11"+
    "\1\0\5\11\1\177\17\11\21\0\5\135\1\200\50\135"+
    "\6\0\1\11\1\0\17\11\1\201\5\11\27\0\1\11"+
    "\1\0\11\11\1\202\13\11\27\0\1\11\1\0\17\11"+
    "\1\203\5\11\27\0\1\11\1\0\14\11\1\204\10\11"+
    "\27\0\1\11\1\0\3\11\1\205\21\11\27\0\1\11"+
    "\1\0\5\11\1\206\17\11\27\0\1\11\1\0\3\11"+
    "\1\207\21\11\21\0\4\135\1\4\1\200\50\135\6\0"+
    "\1\11\1\0\16\11\1\210\6\11\27\0\1\11\1\0"+
    "\17\11\1\211\5\11\27\0\1\11\1\0\11\11\1\212"+
    "\13\11\27\0\1\11\1\0\5\11\1\213\17\11\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4508];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\1\1\1\11"+
    "\16\1\10\11\6\1\1\11\1\0\1\1\1\0\31\1"+
    "\1\0\32\1\1\0\1\1\1\11\25\1\1\0\12\1"+
    "\1\0\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

	


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  lexerProyecto(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error "+ yytext() +" en la linea "+ yyline + ", columna " + yycolumn);
            }
          case 45: break;
          case 2: 
            { 
            }
          case 46: break;
          case 3: 
            { System.out.println("OPREL");
            }
          case 47: break;
          case 4: 
            { System.out.println("NUM");
            }
          case 48: break;
          case 5: 
            { System.out.println("DOT");
            }
          case 49: break;
          case 6: 
            { System.out.println("ID");
            }
          case 50: break;
          case 7: 
            { System.out.println("LPAREN");
            }
          case 51: break;
          case 8: 
            { System.out.println("RPAREN");
            }
          case 52: break;
          case 9: 
            { System.out.println("LBRACE");
            }
          case 53: break;
          case 10: 
            { System.out.println("RBRACE");
            }
          case 54: break;
          case 11: 
            { System.out.println("LBRACK");
            }
          case 55: break;
          case 12: 
            { System.out.println("RBRACK");
            }
          case 56: break;
          case 13: 
            { System.out.println("SEMICOLON");
            }
          case 57: break;
          case 14: 
            { System.out.println("COMMA");
            }
          case 58: break;
          case 15: 
            { System.out.println("OPSUMA");
            }
          case 59: break;
          case 16: 
            { System.out.print(yytext());
            }
          case 60: break;
          case 17: 
            { System.out.println("TO");
            }
          case 61: break;
          case 18: 
            { System.out.println("FF");
            }
          case 62: break;
          case 19: 
            { System.out.println("IF");
            }
          case 63: break;
          case 20: 
            { System.out.println("DO");
            }
          case 64: break;
          case 21: 
            { System.out.println("FOR");
            }
          case 65: break;
          case 22: 
            { System.out.println("NEW");
            }
          case 66: break;
          case 23: 
            { System.out.println("INT");
            }
          case 67: break;
          case 24: 
            { System.out.println("BOOLEAN");
            }
          case 68: break;
          case 25: 
            { System.out.println("BYTE");
            }
          case 69: break;
          case 26: 
            { System.out.println("ELSE");
            }
          case 70: break;
          case 27: 
            { System.out.println("TRUE");
            }
          case 71: break;
          case 28: 
            { System.out.println("THEN");
            }
          case 72: break;
          case 29: 
            { System.out.println("THIS");
            }
          case 73: break;
          case 30: 
            { System.out.println("CASE");
            }
          case 74: break;
          case 31: 
            { System.out.println("CHAR");
            }
          case 75: break;
          case 32: 
            { System.out.println("FUNC");
            }
          case 76: break;
          case 33: 
            { System.out.println("NULL");
            }
          case 77: break;
          case 34: 
            { System.out.println("GOTO");
            }
          case 78: break;
          case 35: 
            { System.out.println("BREAK");
            }
          case 79: break;
          case 36: 
            { System.out.println("FALSE");
            }
          case 80: break;
          case 37: 
            { System.out.println("WHILE");
            }
          case 81: break;
          case 38: 
            { System.out.println("RETURN");
            }
          case 82: break;
          case 39: 
            { System.out.println("REPEAT");
            }
          case 83: break;
          case 40: 
            { System.out.println("SWITCH");
            }
          case 84: break;
          case 41: 
            { System.out.println("DOUBLE");
            }
          case 85: break;
          case 42: 
            { System.out.println("PRINTLN");
            }
          case 86: break;
          case 43: 
            { System.out.println("DEFAULT");
            }
          case 87: break;
          case 44: 
            { System.out.println("CONTINUE");
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java lexerProyecto [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        lexerProyecto scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new lexerProyecto(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
