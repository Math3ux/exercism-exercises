class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder resultado = new StringBuilder();
        boolean capitalizarProximo = false;
        for (int i = 0; i < identifier.length(); i++) {
            char caractereAtual = identifier.charAt(i);
            if (caractereAtual == '-') {
                capitalizarProximo = true;
            } else {
                if (capitalizarProximo) {
                    resultado.append(Character.toUpperCase(caractereAtual));
                    capitalizarProximo = false; 
                } else {
                    resultado.append(caractereAtual);
                }
            }
        }

        return resultado.toString().replace("¡","").replace("!","").replace(" ", "_").replace("3", "e").replace("0", "o").replace("$", "").replace("#","").replace(".","").replace("4","a").replace("7","t").replace("1","l");
    }
}
