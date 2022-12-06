class MicroBlog {
    public String truncate(String input) {

        int valorMaximo = 5;

        return input.codePoints().limit(valorMaximo)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();


//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
