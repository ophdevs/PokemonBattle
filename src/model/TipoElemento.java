package model;

public enum TipoElemento {
    FOGO,
    AGUA,
    ELETRICO,
    PLANTA;

    public double calcularVantagem(TipoElemento oponente){
        switch (this){
            case FOGO:
                if (oponente == PLANTA) return 2.0;
                if (oponente == AGUA) return 0.5;
                return 1.0;

            case AGUA:
                if (oponente == FOGO) return 2.0;
                if (oponente == PLANTA) return 0.5;
                return 1.0;

            case PLANTA:
                if (oponente == AGUA) return 2.0;
                if (oponente == FOGO) return 0.5;
                return 1.0;

            case ELETRICO:
                if (oponente == AGUA) return 2.0;
                if (oponente == PLANTA) return 0.5;
                return 1.0;

            default:
                return 1.0;
        }
    }
}
