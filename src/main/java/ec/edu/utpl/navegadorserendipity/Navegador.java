/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.navegadorserendipity;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.linkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author utpl
 */
public class Navegador {

    static List<String> list = new ArrayList<>();

    public void Navegador() {

    }

    public static void main(String[] args) throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        list.clear();
        list.add("java");
        list.add("estadistica");
        list.add("física");
        list.add("matematicas");
        list.add("quimica");
        list.add("biología");
        list.add("anatomía");
        list.add("electrónica");
        list.add("finanzas");
        list.add("politica");
        list.add("calculo");
        list.add("analisis de datos");
        list.add("gastronomy");
        list.add("robotica");
        list.add("robotica");
        list.add("fisiologia");

        list.add("science");
        list.add("english");
        list.add("post-secondary");
        list.add("management");
        list.add("history");
        list.add("mathematics");
        list.add("ciencias");
        list.add("electrical engineering and computer science");
        list.add("literature");
        list.add("health");
        list.add("economics");
        list.add("urban studies and planning");
        list.add("education");
        list.add("engineering");
        list.add("caminos");
        list.add("architecture");
        list.add("ciencias sociales y juridicas");
        list.add("culture");
        list.add("political science");
        list.add("humanities");
        list.add("physics");
        list.add("biology");
        list.add("politics");
        list.add("downloadable documents");
        list.add("earth atmospheric and planetary sciences");
        list.add("ingenieria");
        list.add("arquitectura");
        list.add("mechanical engineering");
        list.add("technology");
        list.add("writing");
        list.add("arts and humanities");
        list.add("brain and cognitive sciences");
        list.add("design");
        list.add("enginyeria");
        list.add("sciences");
        list.add("policy");
        list.add("environment");
        list.add("foreign languages and literatures");
        list.add("economia");
        list.add("matematica aplicada");
        list.add("audio");
        list.add("language");
        list.add("ciencias de la salud");
        list.add("derecho");
        list.add("linguistics and philosophy");
        list.add("ensenanzas tecnicas");
        list.add("lenguajes y sistemas informaticos");
        list.add("civil and environmental engineering");
        list.add("chemistry");
        list.add("gender");
        list.add("sociales");
        list.add("communication");
        list.add("medicine");
        list.add("ciencias sociales");
        list.add("faculty");
        list.add("philosophy");
        list.add("media");
        list.add("arquitectura y tecnologia de computadores");
        list.add("general");
        list.add("construccion");
        list.add("social sciences");
        list.add("anthropology");
        list.add("aeronautics and astronautics");
        list.add("civil");
        list.add("health and social care");
        list.add("race");
        list.add("international");
        list.add("juridicas");
        list.add("globalization");
        list.add("writing and humanistic studies");
        list.add("ethics");
        list.add("electronica");
        list.add("special programs");
        list.add("audio lectures");
        list.add("learning");
        list.add("music and theater arts");
        list.add("public");
        list.add("informatica tecnologia i multimedia");
        list.add("social");
        list.add("business and management");
        list.add("analysis");
        list.add("economia aplicada");
        list.add("society");
        list.add("statistics");
        list.add("religion");
        list.add("mathematics and statistics");
        list.add("identity");
        list.add("video");
        list.add("materials science and engineering");
        list.add("centre for higher education development");
        list.add("ocw");
        list.add("business");
        list.add("energy");
        list.add("innovation");
        list.add("development");
        list.add("psychology");
        list.add("text/html webpages");
        list.add("matematicas");
        list.add("educacion");
        list.add("law");
        list.add("internet");
        list.add("engineering and technology");
        list.add("health sciences and technology");
        list.add("structure");
        list.add("media arts and sciences");
        list.add("film");
        list.add("disease");
        list.add("cursos gratuitos");
        list.add("information");
        list.add("ingenieria informatica");
        list.add("notre dame");
        list.add("sistemas");
        list.add("thermodynamics");
        list.add("ciencia");
        list.add("geologica");
        list.add("science technology and society");
        list.add("biotechnology");
        list.add("evolution");
        list.add("open");
        list.add("health sciences");
        list.add("engineering systems division");
        list.add("courseware");
        list.add("research");
        list.add("quimica");
        list.add("telecomunicacions");
        list.add("poverty");
        list.add("fisica");
        list.add("readings");
        list.add("urban planning");
        list.add("planning");
        list.add("nuclear engineering");
        list.add("reading");
        list.add("poetry");
        list.add("didactica y organizacion escolar");
        list.add("informatica");
        list.add("mecanica");
        list.add("languages");
        list.add("computacion");
        list.add("scotland");
        list.add("analisis matematico");
        list.add("arquitectura e ingenieria");
        list.add("arts");
        list.add("studies");
        list.add("algebra");
        list.add("resources");
        list.add("genetics");
        list.add("narrative");
        list.add("dna");
        list.add("psicologia");
        list.add("art");
        list.add("systems");
        list.add("power");
        list.add("china");
        list.add("global");
        list.add("risk");
        list.add("humanidades");
        list.add("life");
        list.add("biological engineering");
        list.add("theory");
        list.add("teoria de la senal y comunicaciones");
        list.add("supplemental");
        list.add("war");
        list.add("artificial");
        list.add("filologia inglesa");
        list.add("ingenieria mecanica");
        list.add("ingenieria telematica");
        list.add("political");
        list.add("analisis");
        list.add("marketing");
        list.add("probability");
        list.add("community");
        list.add("sexuality");
        list.add("democracy");
        list.add("materials");
        list.add("comunicacion");
        list.add("dibujo");
        list.add("public policy");
        list.add("teaching");
        list.add("strategy");
        list.add("biostatistics");
        list.add("construction");
        list.add("organizacion");
        list.add("geesoer");
        list.add("environmental");
        list.add("human");
        list.add("ingenieria de sistemas y automatica");
        list.add("economia financiera y contabilidad");
        list.add("training materials");
        list.add("decision making");
        list.add("music");
        list.add("salud");
        list.add("artificial intelligence");
        list.add("ingenieria quimica");
        list.add("artes y humanidades");
        list.add("behavior");
        list.add("fisica aplicada");
        list.add("brain");
        list.add("matematiques");
        list.add("inteligencia");
        list.add("grammar");
        list.add("chemical engineering");
        list.add("information technology");
        list.add("fine art");
        list.add("for");
        list.add("memory");
        list.add("modeling");
        list.add("programacion");
        list.add("cad");
        list.add("calculo");
        list.add("optimization");
        list.add("tecnologia electronica");
        list.add("united states");
        list.add("school");
        list.add("finance");
        list.add("workshop");
        list.add("government");
        list.add("europe");
        list.add("agriculture");
        list.add("estadistica e investigacion operativa");
        list.add("performance");
        list.add("digital");
        list.add("public lecture");
        list.add("water");
        list.add("gipca");
        list.add("climate change");
        list.add("composition");
        list.add("linguistics");
        list.add("matlab");
        list.add("centre for open learning");
        list.add("competition");
        list.add("latin  america");
        list.add("ingenieria y arquitectura");
        list.add("diversos");
        list.add("economic development");
        list.add("africa");
        list.add("tecnicas");
        list.add("educacion fisica y deportiva");
        list.add("empresa");
        list.add("conference");
        list.add("informacio i comunicacio");
        list.add("transportation");
        list.add("conflict");
        list.add("sociologia");
        list.add("linear algebra");
        list.add("class");
        list.add("leadership");
        list.add("ethnicity");
        list.add("computer");
        list.add("psicologia social");
        list.add("story-telling");
        list.add("tectonics");
        list.add("presentations");
        list.add("international relations");
        list.add("diversity");
        list.add("genes");
        list.add("stress");
        list.add("sustainability");
        list.add("bio_chemistry");
        list.add("textbooks");
        list.add("software");
        list.add("design process");
        list.add("computation");
        list.add("laboratory");
        list.add("economic");
        list.add("ecologia");
        list.add("nature");
        list.add("perception");
        list.add("chinese");
        list.add("shakespeare");
        list.add("photography");
        list.add("methods");
        list.add("lengua espanola");
        list.add("natural");
        list.add("other");
        list.add("gestion");
        list.add("earth");
        list.add("administracion");
        list.add("psicologia basica");
        list.add("informaticos");
        list.add("investigacion");
        list.add("fiction");
        list.add("novel");
        list.add("didactica de la expresion corporal");
        list.add("entrepreneurship");
        list.add("theater");
        list.add("manufacturing");
        list.add("diffusion");
        list.add("rna");
        list.add("ecology");
        list.add("television");
        list.add("programming");
        list.add("modern");
        list.add("control");
        list.add("population");
        list.add("nutrition");
        list.add("ukoer");
        list.add("representation");
        list.add("cities");
        list.add("desarrollo");
        list.add("sociology");
        list.add("industrialization");
        list.add("ciencies");
        list.add("structures");
        list.add("simulation");
        list.add("intellectual property");
        list.add("sampling");
        list.add("lecture notes");
        list.add("security");
        list.add("translation");
        list.add("cognition");
        list.add("cursos");
        list.add("enfermeria");
        list.add("networks");
        list.add("aprendizaje");
        list.add("uncertainty");
        list.add("global warming");
        list.add("matrices");
        list.add("mammals");
        list.add("communications");
        list.add("speaking");
        list.add("game theory");
        list.add("spanish");
        list.add("vision");
        list.add("infectious");
        list.add("drama");
        list.add("comparative media studies");
        list.add("urban");
        list.add("commerce");
        list.add("space");
        list.add("pedagogia");
        list.add("urban design");
        list.add("centre for educational technology");
        list.add("aplicada");
        list.add("america");
        list.add("derecho del trabajo y de la seguridad social");
        list.add("teaching_techniques");
        list.add("cursos de profesional");
        list.add("e-motion");
        list.add("nationalism");
        list.add("biblioteconomia y documentacion");
        list.add("biblioteconomia i documentacio");
        list.add("family");
        list.add("ensenanza");
        list.add("algorithms");
        list.add("immigration");
        list.add("food");
        list.add("center");
        list.add("energia");
        list.add("housing");
        list.add("risk management");
        list.add("renaissance");
        list.add("comunicacion audiovisual y publicidad");
        list.add("organitzacio");
        list.add("ingenierias");
        list.add("multi-media");
        list.add("vocabulary");
        list.add("quantum mechanics");
        list.add("creativity");
        list.add("gis");
        list.add("negotiation");
        list.add("courses");
        list.add("cancer");
        list.add("conversation");
        list.add("sensors");
        list.add("calculus");
        list.add("radiation");
        list.add("asia");
        list.add("political theory");
        list.add("proyectos de ingenieria");
        list.add("molecular biology");
        list.add("modelling");
        list.add("case studies");
        list.add("diseno");
        list.add("documentacion");
        list.add("public health");
        list.add("d'empreses");
        list.add("ciencias experimentales");
        list.add("military");
        list.add("pricing");
        list.add("didactica");
        list.add("economica");
        list.add("matematica");
        list.add("capitalism");
        list.add("espanol");
        list.add("funciones");
        list.add("lenguajes");
        list.add("women");
        list.add("contabilidad");
        list.add("logic");
        list.add("medicina");
        list.add("aesthetics");
        list.add("estructura");
        list.add("historia");
        list.add("cultural");
        list.add("contemporary");
        list.add("japan");
        list.add("electromagnetism");
        list.add("human rights");
        list.add("migration");
        list.add("planificacion");
        list.add("ciencias juridicas");
        list.add("maths_modelling");
        list.add("derecho constitucional");
        list.add("pollution");
        list.add("regression");
        list.add("aristotle");
        list.add("economy");
        list.add("synthesis");
        list.add("american");
        list.add("feminism");
        list.add("decision-making");
        list.add("neuroscience");
        list.add("dynamic programming");
        list.add("sustainable development");
        list.add("plasticity");
        list.add("diabetes");
        list.add("monitoring");
        list.add("models");
        list.add("quimica fisica");
        list.add("place");
        list.add("integration");
        list.add("data");
        list.add("computing");
        list.add("film and media studies");
        list.add("mechanics");
        list.add("artes");
        list.add("student work");
        list.add("welfare");
        list.add("dynamics");
        list.add("animals");
        list.add("estado");
        list.add("zoologia");
        list.add("gestao empresarial");
        list.add("stability");
        list.add("relationships");
        list.add("audio-visual");
        list.add("intercultural and diversity studies");
        list.add("cristalografia y mineralogia");
        list.add("video lectures");
        list.add("entropy");
        list.add("holiday");
        list.add("differential equations");
        list.add("expresion grafica en la ingenieria");
        list.add("cienciasss");
        list.add("tic");
        list.add("materiales");
        list.add("calidad");
        list.add("games");
        list.add("gene expression");
        list.add("noise");
        list.add("genomics");
        list.add("python");
        list.add("care");
        list.add("training");
        list.add("differentiation");
        list.add("infrastructure");
        list.add("organizacion de empresas");
        list.add("neighborhood");
        list.add("discussion");
        list.add("plato");
        list.add("advertising");
        list.add("institutions");
        list.add("teamwork");
        list.add("project management");
        list.add("geography");
        list.add("slavery");
        list.add("mandarin");
        list.add("listening");
        list.add("french");
        list.add("organization");
        list.add("termodinamica");
        list.add("derecho civil");
        list.add("india");
        list.add("estructuras");
        list.add("trabajo");
        list.add("reproduction");
        list.add("comunicacio audiovisual i publicitat");
        list.add("fisiologia");
        list.add("filosofia");
        list.add("ingenieria electrica");
        list.add("world");
        list.add("sex");
        list.add("computers");
        list.add("terrorism");
        list.add("child");
        list.add("formacion");
        list.add("cooperacio");
        list.add("text");
        list.add("objects");
        list.add("historical");
        list.add("rhetoric");
        list.add("geografia humana");
        list.add("integracion");
        list.add("production");
        list.add("markets");
        list.add("econometrics");
        list.add("functions");
        list.add("information systems");
        list.add("and ocean sciences");
        list.add("product design");
        list.add("microeconomia");
        list.add("equity");
        list.add("cooperation");
        list.add("data structures");
        list.add("bible");
        list.add("function");
        list.add("on");
        list.add("climate");
        list.add("collaboration");
        list.add("modernism");
        list.add("knowledge");
        list.add("sistema");
        list.add("quimica organica");
        list.add("data analysis");
        list.add("derecho administrativo");
        list.add("cosmology");
        list.add("landscape");
        list.add("ingenieria agroforestal");
        list.add("racism");
        list.add("product development");
        list.add("industry");
        list.add("mass");
        list.add("seguridad");
        list.add("letters");
        list.add("electricidad");
        list.add("classical music");
        list.add("seminar");
        list.add("sociedad");
        list.add("proteins");
        list.add("motion");
        list.add("experiment");
        list.add("oral presentation");
        list.add("cloning");
        list.add("bioinformatics");
        Robot robot = new Robot();  // Robot class throws AWT Exception  
        while (true) {
            Random random = new Random();
            int aleatorio_app = random.nextInt(2);
            //int aleatorio_app = 1;
            if (aleatorio_app == 0) {

                driver.get("http://j4loxa.com/datalab/serendipity/");
                robot.delay(10000);
                driver.get("http://serendipity.utpl.edu.ec/");
                robot.delay(5000);
            //element.sendKeys("java");

                //for (int i = 0; i < list.size(); i++) {
                int value = random.nextInt(list.size());
                System.out.println("aleaotrio: " + value);
                WebElement element = driver.findElement(By.name("q"));
                String word = list.get(value);
                type(word, element, robot);
                element.submit();
                System.out.println("Page title is: " + driver.getTitle());
                robot.delay(5000);
                WebElement txt = driver.findElement(By.className("text-success"));
                int num = 0;
                for (StringTokenizer stringTokenizer = new StringTokenizer(txt.getText()); stringTokenizer.hasMoreTokens();) {
                    String token = stringTokenizer.nextToken();
                    num = Integer.parseInt(token);
                    break;
                }
                int numveces = 0;
                if (num > 16) {
                    numveces = 16;
                } else if (num > 0) {
                    numveces = num;
                }
                System.out.println(">>>>>>>>>>>>>>>  " + txt.getText());
                JavascriptExecutor jsx = (JavascriptExecutor) driver;
                //int y = 350;
                for (int j = 0; j < numveces; j++) {
                    jsx.executeScript("window.scrollBy(0, 350)", "");
                    robot.delay(2000);
                    //y += 350;
                }
                //jsx.executeScript("window.scroll(0, -250);");
                for (int j = 0; j < numveces * 8; j++) {
                    jsx.executeScript("window.scrollBy(0, -50)", "");
                    robot.delay(250);
                }
                jsx.executeScript("window.scroll(0, -50);");

                if (num > 0) {

                    List<WebElement> elementos = driver.findElements(By.xpath("//h4[@property='title']"));
                    System.out.println(elementos.size());

                    int aleatorio2 = random.nextInt(elementos.size());
                    WebElement get = elementos.get(aleatorio2);
                    WebElement ele = get.findElement(By.tagName("a"));
                    System.out.println(ele.getAttribute("href"));
                    ele.sendKeys("");
                    robot.delay(5000);
                    WebDriverWait wait = new WebDriverWait(driver, 1);
                    driver.get(ele.getAttribute("href"));
                    robot.delay(10000);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("accordion-group")));
                    WebElement acordeon = driver.findElement(By.className("accordion-group"));

                    List<WebElement> acs = acordeon.findElements(By.className("accordion-toggle"));
                    for (int j = 0; j < acs.size(); j++) {
                        WebElement get1 = acs.get(j);

                        //System.out.println("acordeon: "+get1.getAttribute("href"));
                        get1.click();
                        robot.delay(5000);

                    }

//                WebElement primer = driver.findElement(By.xpath("//div[@class='span9']"));
//                WebElement seg = primer.findElement(By.xpath("//div[@class='span6 thumbnail']"));
//                WebElement ter = seg.findElement(By.xpath("//a[@class='fancybox fancybox.iframe']"));
//                System.out.println(ter.getAttribute("href"));
//                
//                ter.sendKeys("");
//                robot.delay(5000);
//                driver.get(ter.getAttribute("href"));
//                robot.delay(10000);
//                driver.navigate().back();
//                robot.delay(10000);
                }

                WebElement reset = driver.findElement(By.id("resetBtn"));
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", reset);

//                    if (i < list.size() - 1) {
//                        driver.get("http://j4loxa.com/datalab/serendipity/");
//                        robot.delay(10000);
//                        driver.get("http://serendipity.utpl.edu.ec/");
//                        robot.delay(5000);
//                    }
                //}
            } else if (aleatorio_app == 10) {
                driver.get("http://j4loxa.com/datalab/ocwtagrecommender/");
                robot.delay(10000);
                driver.get("http://j4loxa.com/snaocwservices/");
                robot.delay(5000);
                int value = random.nextInt(list.size());
                WebElement element = driver.findElement(By.id("tag"));
                String word = list.get(value);
                type(word, element, robot);
                robot.delay(1000);
                WebDriverWait wait = new WebDriverWait(driver, 1);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-1")));
                element.sendKeys(Keys.ARROW_DOWN);
                robot.keyPress(KeyEvent.VK_ENTER);
                element.sendKeys(Keys.ENTER);
                robot.delay(1000);
                //robot.keyPress(KeyEvent.VK_RIGHT);

                //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-1")));
                //WebElement ele = driver.findElement(By.id("ui-id-1"));
                //ele.click();
                //ele.click();
                //robot.keyPress(KeyEvent.VK_ENTER);
                System.out.println("Page title is: " + driver.getTitle());
                robot.delay(15000);
                List<WebElement> eles = driver.findElements(By.tagName("text"));
                System.out.println(">>>>>> " + eles.size());
                if (eles.size() > 0) {
                    eles.get(0).click();
                    robot.delay(10000);
                }
            } else if (aleatorio_app == 1) {
                driver.get("http://ambar.utpl.edu.ec/about");
                robot.delay(10000);
                int aleatorio_ambar = random.nextInt(3);
                if (aleatorio_ambar == 0) {
                    driver.get("http://ambar.utpl.edu.ec/dataset");
                    robot.delay(5000);
                    List<WebElement> li = driver.findElements(By.className("dataset-heading"));
                    System.out.println(">>>>>>>>>>>" + li.size());
                    JavascriptExecutor jsx = (JavascriptExecutor) driver;
                    for (int j = 0; j < li.size(); j++) {
                        jsx.executeScript("window.scrollBy(0, 150)", "");
                        robot.delay(2000);
                    }
                    for (int j = 0; j < li.size() * 4; j++) {
                        jsx.executeScript("window.scrollBy(0, -50)", "");
                        robot.delay(250);
                    }
                    int aleatorio_li = random.nextInt(li.size());
                    WebElement e = li.get(aleatorio_li);
                    WebElement el = e.findElement(By.tagName("a"));
                    el.sendKeys("");
                    String link = el.getAttribute("href");
                    System.out.println(">>>>>>>>>>>" + link);
                    driver.get(link);
                    robot.delay(10000);
                    WebDriverWait wait = new WebDriverWait(driver, 1);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                    WebElement ul = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']"));
                    if (ul != null) {
                        List<WebElement> tabs = ul.findElements(By.tagName("a"));
                        System.out.println("num tabs: " + tabs.size());
                        //List<String> links = new ArrayList<>();
                        for (int j = 1; j < tabs.size(); j++) {
                            WebElement get1 = tabs.get(j);
                            //System.out.println("tab: " + get1.getText());
                            //WebElement a = get1.findElement(By.tagName("a"));
                            System.out.println("tab: " + get1.getAttribute("href"));
                            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                            //driver.get(get1.getAttribute("href"));
                            //links.add(a.getAttribute("href"));
                            //get1.click();
                            //robot.delay(5000);
                        }
                        robot.delay(5000);
                    }

                } else if (aleatorio_ambar == 1) {
                    driver.get("http://ambar.utpl.edu.ec/organization");
                    robot.delay(5000);
                    List<WebElement> li = driver.findElements(By.className("media-view"));
                    System.out.println(">>>>>>>>>>>" + li.size());
                    JavascriptExecutor jsx = (JavascriptExecutor) driver;
                    for (int j = 0; j < li.size() / 2; j++) {
                        jsx.executeScript("window.scrollBy(0, 250)", "");
                        robot.delay(2000);
                    }
                    for (int j = 0; j < li.size() * 4; j++) {
                        jsx.executeScript("window.scrollBy(0, -50)", "");
                        robot.delay(250);
                    }
                    int aleatorio_li = random.nextInt(li.size());
                    WebElement e = li.get(aleatorio_li);
                    e.sendKeys("");
                    String link = e.getAttribute("href");
                    System.out.println(">>>>>>>>>>>" + link);
                    driver.get(link);
                    robot.delay(10000);
                    WebDriverWait wait = new WebDriverWait(driver, 1);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                    WebElement ul = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']"));
                    if (ul != null) {
                        List<WebElement> tabs = ul.findElements(By.tagName("a"));
                        System.out.println("num tabs: " + tabs.size());
                        
                        for (int j = 1; j < tabs.size(); j++) {
                            WebElement get1 = tabs.get(j);
                            //System.out.println("tab: " + get1.getText());
                            //WebElement a = get1.findElement(By.tagName("a"));
                            System.out.println("tab: " + get1.getAttribute("href"));
                            //get1.click();
                            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                            //driver.get(get1.getAttribute("href"));
                            //robot.delay(5000);

                        }
                        robot.delay(5000);
                    }
                } else if (aleatorio_ambar == 2) {
                    driver.get("http://ambar.utpl.edu.ec/group");
                    robot.delay(5000);
                    List<WebElement> li = driver.findElements(By.className("media-view"));
                    System.out.println(">>>>>>>>>>>" + li.size());
                    JavascriptExecutor jsx = (JavascriptExecutor) driver;
                    for (int j = 0; j < li.size() / 2; j++) {
                        jsx.executeScript("window.scrollBy(0, 250)", "");
                        robot.delay(2000);
                    }
                    for (int j = 0; j < li.size() * 4; j++) {
                        jsx.executeScript("window.scrollBy(0, -50)", "");
                        robot.delay(250);
                    }
                    int aleatorio_li = random.nextInt(li.size());
                    WebElement e = li.get(aleatorio_li);
                    e.sendKeys("");
                    String link = e.getAttribute("href");
                    System.out.println(">>>>>>>>>>>" + link);
                    driver.get(link);
                    robot.delay(10000);
                    WebDriverWait wait = new WebDriverWait(driver, 1);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                    WebElement ul = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']"));
                    if (ul != null) {
                        List<WebElement> tabs = ul.findElements(By.tagName("a"));
                        System.out.println("num tabs: " + tabs.size());
                        for (int j = 1; j < tabs.size(); j++) {
                            WebElement get1 = tabs.get(j);
                            //System.out.println("tab: " + get1.getText());
                            //WebElement a = get1.findElement(By.tagName("a"));
                            System.out.println("tab: " + get1.getAttribute("href"));
                            //get1.click();
                            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav nav-tabs']")));
                            //driver.get(get1.getAttribute("href"));
                            
                        }
                        robot.delay(5000);
                    }
                }
            }

        }
        //jsx.executeScript("window.history.go(-1)");
        //robot.delay(5000);
        //driver.quit();

    }

    private static void type(String s, WebElement element, Robot robot) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            element.sendKeys(c + "");
            robot.delay(200);
        }
    }

}
